
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


---

# Github remove 
removes the file 
```zsh
git rm --cached name_of_file
```

---
# Collaboration guide 

the procedure should be the below:

- pull the file
- edit it
- commit it(it commits to your local repository)
- pull it again (if there are any conflict you will Be notified) in that case you can solve it executing the below command(GitBash on your repository working folder):
    
    git mergetool
https://stackoverflow.com/questions/8508861/two-people-working-on-a-file-at-the-same-time-in-git


---

# SSH KEYS
[somones instructions](https://gist.github.com/rahularity/86da20fe3858e6b311de068201d279e3#step-1)
[github Docs adding SSH keys](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account?tool=webui)
[generating ssh keys](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)
[Credentials manager things](https://github.com/git-ecosystem/git-credential-manager/blob/main/docs/multiple-users.md)
