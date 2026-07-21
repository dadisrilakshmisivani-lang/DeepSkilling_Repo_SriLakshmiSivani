# Git and GitLab Hands-on Exercises

## Overview

This repository contains all completed Git and GitLab hands-on exercises. The exercises cover Git configuration, Git Ignore, branching, merging, conflict resolution, and remote repository operations.

---

# Exercise 1: Git Setup and Configuration

## Objectives
- Setup Git environment
- Configure Git user details
- Integrate Notepad++ as Git default editor

## Completed Tasks

### Git Installation Verification

Checked Git installation using:

```bash
git --version
```

### Git User Configuration

Configured username:

```bash
git config --global user.name "username"
```

Configured email:

```bash
git config --global user.email "email"
```

Verified configuration:

```bash
git config --list
```

### Notepad++ Integration

- Installed Notepad++
- Added Notepad++ path to environment variables
- Verified Notepad++ from Git terminal:

```bash
notepad++
```

Configured Notepad++ as Git editor:

```bash
git config --global core.editor "notepad++"
```

---

# Exercise 2: Git Ignore

## Objectives
- Understand `.gitignore`
- Ignore unwanted files and folders

## Completed Tasks

Created log file:

```
sample.log
```

Created log folder:

```
log/
```

Created `.gitignore` file and added:

```
*.log
log/
```

### Explanation

- `*.log` ignores all files with `.log` extension.
- `log/` ignores the complete log folder.

Verified ignored files using:

```bash
git status
```

The unwanted files were successfully ignored.

---

# Exercise 3: Branching and Merging

## Objectives
- Understand Git branching
- Create and merge branches

## Completed Tasks

Created a new branch:

```bash
git branch GitNewBranch
```

Listed branches:

```bash
git branch -a
```

Switched to new branch:

```bash
git checkout GitNewBranch
```

Added files and committed changes:

```bash
git add .
git commit -m "Added changes in GitNewBranch"
```

Checked status:

```bash
git status
```

Switched back to master:

```bash
git checkout master
```

Compared branch differences:

```bash
git diff master GitNewBranch
```

Merged branch:

```bash
git merge GitNewBranch
```

Viewed commit history:

```bash
git log --oneline --graph --decorate
```

Deleted branch after merging:

```bash
git branch -d GitNewBranch
```

---

# Exercise 4: Merge Conflict Resolution

## Objectives
- Understand merge conflicts
- Resolve conflicts during merging

## Completed Tasks

Created branch:

```bash
git branch GitWork
```

Switched to branch:

```bash
git checkout GitWork
```

Created and modified:

```
hello.xml
```

Committed branch changes:

```bash
git add hello.xml
git commit -m "Updated hello.xml in GitWork"
```

Switched to master:

```bash
git checkout master
```

Created another version of `hello.xml` with different content.

Committed master changes:

```bash
git add hello.xml
git commit -m "Updated hello.xml in master"
```

Checked differences:

```bash
git diff master GitWork
```

Merged branch:

```bash
git merge GitWork
```

Merge conflict was resolved manually by removing conflict markers:

```
<<<<<<< HEAD
=======
>>>>>>>
```

Added resolved file:

```bash
git add hello.xml
```

Committed merge resolution:

```bash
git commit -m "Resolved merge conflict"
```

Updated `.gitignore` for backup files and committed changes.

Deleted merged branch:

```bash
git branch -d GitWork
```

---

# Exercise 5: Clean Up and Push Back to Remote Git

## Objectives
- Pull and push changes to remote Git repository

## Completed Tasks

Checked master status:

```bash
git status
```

Listed branches:

```bash
git branch -a
```

Connected local repository with GitLab:

```bash
git remote add origin <repository-url>
```

Verified remote repository:

```bash
git remote -v
```

Configured SSH authentication:

- Generated SSH key
- Added SSH key to GitLab
- Verified SSH connection

Pulled changes from remote repository:

```bash
git pull origin master
```

Pushed changes to GitLab:

```bash
git push origin master
```

Changes were successfully reflected in the remote GitLab repository.

---

# Tools Used

- Git
- Git Bash
- GitLab
- Notepad++
- SSH Authentication

---

# Conclusion

All Git and GitLab hands-on exercises were completed successfully.


