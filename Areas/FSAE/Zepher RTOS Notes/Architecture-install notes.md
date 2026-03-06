


# Dev Setup 

- Zephyr uses python and the west package to manage dependencies and installs
- The zephyr SDK handles toochains for installs but bespoke toolchains can be used to flash onto a specific board. 


## WEST


**Structure for the given Zephyr Structure**
```
zephyrproject/                 # west topdir
├── .west/                     # marks the location of the topdir
│   └── config                 # per-workspace local configuration file
│
│   # The manifest repository, never modified by west after creation:
├── zephyr/                    # .git/ repo
│   ├── west.yml               # manifest file
│   └── [... other files ...]
│
│   # Projects managed by west:
├── modules/
│   └── lib/
│       └── zcbor/             # .git/ project
├── tools/
│   └── net-tools/             # .git/ project
└── [ ... other projects ...]

```


- `west init` creates the west workspace and clones the manifest repo
- `west update` innitally clones and later updates the projects listed in the manifest workspace.


## Basic west workspaces 


### **topdir**

Above, `zephyrproject` is the name of the workspace’s top level directory, or _topdir_. (The name `zephyrproject` is just an example – it could be anything, like `z`, `my-zephyr-workspace`, etc.)

You’ll typically create the topdir and a few other files and directories using [west init](https://docs.zephyrproject.org/latest/develop/west/basics.html?utm_source=chatgpt.com#west-init-basics).

### **.west directory**

The topdir contains the `.west` directory. When west needs to find the topdir, it searches for `.west`, and uses its parent directory. The search starts from the current working directory (and starts again from the location in the [`ZEPHYR_BASE`](https://docs.zephyrproject.org/latest/develop/env_vars.html#envvar-ZEPHYR_BASE) environment variable as a fallback if that fails).

### **configuration file**

The file `.west/config` is the workspace’s [local configuration file](https://docs.zephyrproject.org/latest/develop/west/config.html#west-config).

### **manifest repository**

Every west workspace contains exactly one _manifest repository_, which is a Git repository containing a _manifest file_. The location of the manifest repository is given by the [manifest.path configuration option](https://docs.zephyrproject.org/latest/develop/west/config.html#west-config-index) in the local configuration file.

For upstream Zephyr, `zephyr` is the manifest repository, but you can configure west to use any Git repository in the workspace as the manifest repository. The only requirement is that it contains a valid manifest file. See [Topologies supported](https://docs.zephyrproject.org/latest/develop/west/workspaces.html#west-topologies) for information on other options, and [West Manifests](https://docs.zephyrproject.org/latest/develop/west/manifest.html#west-manifests) for details on the manifest file format.

### **manifest file**

The manifest file is a YAML file that defines _projects_, which are the additional Git repositories in the workspace managed by west. The manifest file is named `west.yml` by default; this can be overridden using the `manifest.file` local configuration option.

You use the [west update](https://docs.zephyrproject.org/latest/develop/west/basics.html?utm_source=chatgpt.com#west-update-basics) command to update the workspace’s projects based on the contents of the manifest file.

### **projects**

Projects are Git repositories managed by west. Projects are defined in the manifest file and can be located anywhere inside the workspace. In the above example workspace, `zcbor` and `net-tools` are projects.

By default, the Zephyr [build system](https://docs.zephyrproject.org/latest/build/index.html#build-overview) uses west to get the locations of all the projects in the workspace, so any code they contain can be used as [Modules (External projects)](https://docs.zephyrproject.org/latest/develop/modules.html#modules). Note however that modules and projects [are conceptually different](https://docs.zephyrproject.org/latest/develop/modules.html#modules-vs-projects).

### **extensions**

Any repository known to west (either the manifest repository or any project repository) can define [Extensions](https://docs.zephyrproject.org/latest/develop/west/extensions.html#west-extensions). Extensions are extra west commands you can run when using that workspace.

The zephyr repository uses this feature to provide Zephyr-specific commands like [west build](https://docs.zephyrproject.org/latest/develop/west/build-flash-debug.html#west-building). Defining these as extensions keeps west’s core agnostic to the specifics of any workspace’s Zephyr version, etc.

### **ignored files**

A workspace can contain additional Git repositories or other files and directories not managed by west. West basically ignores anything in the workspace except `.west`, the manifest repository, and the projects specified in the manifest file.








### Question
- Whats a manifset repo?
- Whats a west workspace?








****

# Resources 

[WEST as a tool](https://docs.zephyrproject.org/latest/develop/west/basics.html?utm_source=chatgpt.com)

