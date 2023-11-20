
## User not auth on your own account 
```git 
2023-10-26 13:26:33.830 [info] remote: Permission to Pweder69/REC-Eclipse-2024.git denied to japhero.

fatal: unable to access 'https://github.com/Pweder69/REC-Eclipse-2024.git/': The requested URL returned error: 403
```

[fix for mac](https://superuser.com/questions/1064197/how-to-switch-git-user-at-terminal)

--- 

## DS_Store
https://stackoverflow.com/questions/18393498/gitignore-all-the-ds-store-files-in-every-folder-and-subfolder

```python
find . -name .DS_Store -print0 | xargs -0 git rm --ignore-unmatch
```


---

# Clear 
Clear the file from being tracked

```zsh
git reset name_of_file
```
