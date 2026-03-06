
A _devicetree_ is a hierarchical data structure primarily used to describe hardware. Zephyr uses devicetree in two main ways:

- to describe hardware to the [Device Driver Model](https://docs.zephyrproject.org/latest/kernel/drivers/index.html#device-model-api)
- to provide that hardware’s initial configuration


- Both a hardware description language and a configuration language for zephyr. 
- Two types of device tree input files: device tree sources and device tree bindings. 

![](https://docs.zephyrproject.org/latest/_images/zephyr_dt_build_flow.png)
> Device tree build flow 

- The API is based on C macros 
	- Macro names start with `DT_`
	- all generated macros will contain lowercase letters
- 


### Syntax and Structure 
- `.dts` extension for device tree source 


**Example DTS file:**

``` .dts
/dts-v1/;

/ {
        a-node {
                subnode_nodelabel: a-sub-node {
                        foo = <3>;
                };
        };
};
```


#### Nodes
Like any tree data structure, a devicetree has a hierarchy of _nodes_. The above tree has three nodes:

1. A root node: `/`
2. A node named `a-node`, which is a child of the root node
3. A node named `a-sub-node`, which is a child of `a-node`

- node labels give a shorthand for the node and can be referenced elsewhere in the device tree.
	- You can have any number of node labels 

- Devicetree nodes have _paths_ identifying their locations in the tree. Like Unix file system paths, devicetree paths are strings separated by slashes (`/`), and the root node’s path is a single slash: `/`. Otherwise, each node’s path is formed by concatenating the node’s ancestors’ names with the node’s own name, separated by slashes. For example, the full path to `a-sub-node` is `/a-node/a-sub-node`.
	- Like a file system 


#### Properties 

- nodes can have properties they are name value pairs
	- Properties can be any sequence of bytes
	- In some cases the values are an array "cells" A cell is just a 32 bit unsigned integer
	- In the example `a-sub-note` has a property named `foo` with a cell of value 3. 
		- `<>` imply that whats contained by the brackets is a cell.


### Devicetrees Reflect hardware 



**Example device peripheral diagram**

![[Pasted image 20260301213351.png#invert]]

- for the above hardware the corresponding bus controller and each I2C peripheral would be present 

```
/dts-v1/;

/ {
        soc {
                i2c-bus-controller {
                        i2c-peripheral-1 {
                        };
                        i2c-peripheral-2 {
                        };
                        i2c-peripheral-3 {
                        };
                };
        };
};
```

- Properties usually describe or configure the hardware the node represents. For an I2C node a the property value would be the address of the bus


> [!EXAMPLE]- IRL example of an I2C device 
> 
> ![[Pasted image 20260301214006.png]]
> 
> ``` devicetree
> /dts-v1/;
> 
> / {
>         soc {
>                 i2c@40003000 {
>                         compatible = "nordic,nrf-twim";
>                         reg = <0x40003000 0x1000>;
> 
>                         apds9960@39 {
>                                 compatible = "avago,apds9960";
>                                 reg = <0x39>;
>                         };
>                         ti_hdc@43 {
>                                 compatible = "ti,hdc", "ti,hdc1010";
>                                 reg = <0x43>;
>                         };
>                         mma8652fc@1d {
>                                 compatible = "nxp,fxos8700", "nxp,mma8652fc";
>                                 reg = <0x1d>;
>                         };
>                 };
>         };
> };
> ```
> 
> 

#### [Unit addresses](https://docs.zephyrproject.org/latest/build/dts/intro-syntax-structure.html#unit-addresses)

- they are optional 
- they come after the `@` sign 
- In devicetree, unit addresses give a node’s address in the address space of its parent node.

- Read the doc page for specifics 

#### Important Properties 

- Compatible 
	- The name of the hardware device the node represents 
		- Recommended format is `"vendor,device"`
	- The build system uses the compatible property to find the right bindings for the node. 
- reg
	- Information used to address the device. The value is specific to the device. (based on compatible tag).
	- Here are some common patterns:
		- Devices accessed via memory-mapped I/O registers (like `i2c@40003000`): `address` is usually the base address of the I/O register space, and `length` is the number of bytes occupied by the registers.
		- I2C devices (like `apds9960@39` and its siblings): `address` is a slave address on the I2C bus. There is no `length` value.
		- SPI devices: `address` is a chip select line number; there is no `length`.
	- more detailed view of the addressable resources within a device compared to its unit adress
- Status 
	- A string which describes whether the node is enabled.
		- Can have values 
			- `"okay","disabled","reserved","fail","fail-sss"`
				- Only `okay` and `disabled` are used in zephyr


#### Writing property values 

| Property type | How to write                                                                   | Example                                                        |
| ------------- | ------------------------------------------------------------------------------ | -------------------------------------------------------------- |
| string        | Double quoted                                                                  | `a-string = "hello, world!";`                                  |
| int           | between angle brackets ( `<` and `>` )                                         | `an-int = <1>;`                                                |
| boolean       | for `true` , with no value (for `false` , use `/delete-property/ )             | `my-true-boolean;`                                             |
| array         | between angle brackets ( `<` and `>` ), separated by spaces                    | `foo = <0xdeadbeef 1234 0>;`                                   |
| uint8-array   | in hexadecimal without leading `0x` , between square brackets ( `[` and `]` ). | `a-byte-array = [00 01 ab];`                                   |
| string-array  | separated by commas                                                            | `a-string-array = "string one", "string two", "string three";` |
| phandle       | between angle brackets ( `<` and `>` )                                         | `a-phandle = <&mynode>;`                                       |
| phandles      | between angle brackets ( `<` and `>` ), separated by spaces                    | `some-phandles = <&mynode0 &mynode1 &mynode2>;`                |
| phandle-array | between angle brackets ( `<` and `>` ), separated by spaces                    | `a-phandle-array = <&mynode0 1 2>, <&mynode1 3 4>;`            |

