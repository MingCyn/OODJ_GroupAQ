# 🚀 OODJ Assignment – Group AQ

## Team Developer Setup & Git Workflow Guide

To keep our code organized and prevent overwriting each other's work, please follow this guide to set up your Eclipse environment.

---

# 🔑 1. Initial Setup: Connecting Eclipse to GitHub

⚠️ **Do NOT create a new repository. You must clone the existing one.**

**Repository URL**

```
https://github.com/MingCyn/OODJ_GroupAQ.git
```

### Steps in Eclipse

1. Go to **File → Import**
2. Select **Git → Projects from Git (with smart import)**
3. Select **Clone URI**
4. Paste the repository URL

### Authentication

* **Username:** Your GitHub username
* **Password:** Your **Personal Access Token (PAT)**

⚠️ Normal GitHub passwords **will NOT work in Eclipse**

🔒 **Important:** Save your PAT somewhere safe as a backup.

After finishing the setup, Eclipse will download the project to your computer.

---

# 🖥️ 2. Understanding Perspectives (The "Where am I?" Fix)

Eclipse has two main perspectives:

### Java Perspective (Icon: J)

Use this **90% of the time** for:

* Writing code
* Creating classes
* Running programs

### Git Perspective (Orange Diamond)

Use this **only when needed** for:

* Fixing remotes
* Checking branch history

👉 If the **New Class button disappears**, you're probably in the wrong perspective.

---

# 🌿 3. The Golden Rule: Use Branches

⚠️ **Never push directly to the `main` branch.**

This prevents merge conflicts.

### Create a new branch

1. Right-click the project
2. Select **Team → Switch To → New Branch**
3. Name the branch based on your task

Example branch names:

```
login-page
inventory-fix
user-authentication
```

The sidebar will show:

```
[your-branch-name]
```

instead of

```
[main]
```

---

# 💾 4. How to Save and Push Your Work

When you finish a task:

### 1️⃣ Open Git Staging

```
Window → Show View → Other → Git Staging
```

### 2️⃣ Stage Changes

Drag `.java` files from:

```
Unstaged Changes → Staged Changes
```

### 3️⃣ Commit

Write a short commit message.

Example:

```
Added login validation
```

### 4️⃣ Push

Click **Commit and Push**

Your code will be pushed to **your branch (not main)**.

---

# 🔄 5. Making a Pull Request (Merging to Main)

After testing your code:

1. Go to the **GitHub repository website**
2. A yellow bar will appear:

```
"Your branch had recent pushes"
```

3. Click **Compare & Pull Request**
4. Add a description
5. Click **Create Pull Request**

The team will review before merging into `main`.

---

# 📂 Important: Handling `.txt` Files

Our project **ignores `.txt` files in Git**.

### Reason

To prevent developers from overwriting each other's test data.


### What You Need to Do

After cloning the project:

1. Manually create a file named:

```
users.txt
```

2. Place it in the **project folder**

The program will read it locally, but **GitHub will NOT track it**.

---

# ✅ Final Reminder

Following this workflow keeps our project:

* Clean
* Organized
* Conflict-free

🔒 **Always back up your Personal Access Token (PAT)** – it is your key to GitHub access.
