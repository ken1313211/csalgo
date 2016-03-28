# ITWD - Web Design

Chat at   [![Gitter](https://badges.gitter.im/edos4/itwd.svg)](https://gitter.im/edos4/itwd?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

###Table of Contents
  * [Create GitHub Page](#create-github-page)
  * [Setup Git](#setup-git)
    * [At Home](#at-home)
    * [At School](#at-school)
  * [Clone project](#clone-project)
  * [Add a file](#add-a-file)
  * [Edit a file](#edit-a-file)
  * [Delete a file](#delete-a-file)

# Git

### Create GitHub Page
[Create GitHub Page](https://pages.github.com/)

### Setup Git

### At Home
`` If you have any questions,`` [Ask here](https://gitter.im/edos4/itwd) 

1. Create a folder named `git` on your desktop
2. Go to the [ITWD Download Page](https://github.com/edos4/itwd/tree/master/Downloads)
2. Right click `git.jpg`, click `Open link in new tab`
3. Go to the newly opened [tab](https://github.com/edos4/itwd/blob/master/Downloads/git.jpg)
4. Right click `Raw`, click `Save link as...`
5. Save it on the `git` folder on your desktop
6. Go back to the [ITWD Download Page](https://github.com/edos4/itwd/tree/master/Downloads)
7. Right click `rename.bat`, click `Open link in new tab`
8. Right click `Raw`, click `Save link as...`
9. Save it on the `git` folder on your desktop
10. Open the `git` folder on your desktop
11. Double click the `rename.bat` file
12. Right click `git.zip`, click `Extract all`, click `Extract`
13. If you see a `git` folder, open it and double click `PortableGit-2.7.2-32-bit.7z`
14. If you see a `PortableGit-2.7.2-32-bit.7z`, double click it
15. Click `Ok` and wait for the process to finish
16. Open the `PortableGit` directory
17. Double click `git-cmd` or `git-cmd.exe`
18. If this is your first setup on your current computer, [Clone project](#clone-project)
19. If you have already cloned a copy on your current computer, type `cd PROJECT_NAME` where `PROJECT_NAME` is your project folder (i.e. (YOUR_GITHUB_USERNAME).github.io or in my case, edos4.github.io) then press enter. Example would be `cd edos4.github.io`
 
### At School
If you don't have `git.zip` and `rename.bat` on the `git` folder of your drive H:
1. Do steps 1-9 of [At Home](#at-home) but instead of on your desktop, put the `git` folder on your drive H
2. Copy the `git` folder located at your drive H to your desktop. The purpose of this is to avoid doing steps 1-9 all over again.
3. Do steps 10-19 of [At Home](#at-home)

### Clone Project
1. Open your GitHub project page (i.e. (YOUR_GITHUB_USERNAME).github.io or in my case, edos4.github.io)
2. Click this (the one surrounded by the red box) then copy:
![This](https://raw.githubusercontent.com/edos4/itwd/master/assets/repo_name.png)
3. Upon opening `git-cmd` or `git-cmd.exe`, type `git clone ` then paste (right click, then click paste)
4. The sample output should be `git clone https://github.com/edos4/edos4.github.io.git` then press enter
5. Type `cd PROJECT_NAME` where `PROJECT_NAME` is your project folder (i.e. (YOUR_GITHUB_USERNAME).github.io or in my case, edos4.github.io) then press enter. Example would be `cd edos4.github.io`
6. [Add a file](#add-a-file) / [Edit a file](#edit-a-file) / [Delete a file](#delete-a-file)

### Add a file

To add a file: 
```
git add <filename>
```

Repeat this until you have added all the files that you want to add. 

If you want to add all files: 
```
git add *
```

Commit the file:
```
git commit -m "<short description of what you've done>"
```

Push the file:
```
git pull origin master
git push origin master
```
Supply GitHub username and password if required. Password will not be shown as you type. Just type your password.

### Edit a file

Edit a file

Add the file:
```
git add <filename>
```

Commit the file:
```
git commit -m "<short description of what you've done>"
```

Push the file:
```
git pull origin master
git push origin master
```
Supply GitHub username and password if required. Password will not be shown as you type. Just type your password.

### Delete a file

Delete a file

Add the file:
```
git add <filename>
```

Commit the file:
```
git commit -m "<short description of what you've done>"
```

Push the file:
```
git pull origin master
git push origin master
```
Supply GitHub username and password if required. Password will not be shown as you type. Just type your password.
