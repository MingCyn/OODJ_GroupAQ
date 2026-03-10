# OODJ_Assignment_GroupAQ
Team Setup & Git Workflow Guide
To keep our code organized and prevent us from overwriting each other's work, please follow this guide to set up your Eclipse environment.

1. Initial Setup: Connecting Eclipse to GitHub
Do not create a new repository. You will "Clone" the existing one I created.

Copy the Repo URL: https://github.com/MingCyn/OODJ_GroupAQ.git

Import to Eclipse:

Go to File > Import -> Git > Projects from Git (with smart import).

Select Clone URI and paste the URL.

Authentication:

Username: Your GitHub username.

Password: Your Personal Access Token (PAT). (Standard passwords do not work for Eclipse).

Finish: Follow the prompts. Eclipse will download the project to your local computer.

2. Understanding Perspectives (The "Where am I?" fix)
Eclipse has two "modes" we use for this project. Look at the top right corner to switch:

Java Perspective (Icon: J): Use this 90% of the time. This is where you write code, create classes, and run the program.

Git Perspective (Icon: Orange Diamond): Use this only if you need to fix "Remotes" or see the history of branches.

If your "New Class" button disappears, you are probably in the wrong perspective!

3. The Golden Rule: Use Branches
Never push directly to the main branch. If you do, it might cause conflicts for everyone else.

How to create a new branch:

Right-click the project -> Team > Switch To > New Branch...

Name it after your task (e.g., login-page or inventory-fix).

Look at the project name in your sidebar; it should now show [your-branch-name] instead of [main].

4. How to Save and Push Your Work
When you finish a task, follow these steps to send it to GitHub:

Open Git Staging: Go to Window > Show View > Other > Git Staging.

Stage Changes: Drag your new .java files from "Unstaged" to "Staged Changes".

Commit: Write a short message (e.g., "Added login validation").

Push: Click Commit and Push. This sends your code to your branch on GitHub, not the main one.

5. Making a "Pull Request" (Merging to Main)
Once your code is working perfectly and you want to add it to the final project:

Go to our GitHub Website.

You will see a yellow bar saying "Your branch had recent pushes." Click Compare & Pull Request.

Add a description of what you did and click Create Pull Request.

The rest of the team can then review it before it officially joins the main code.

⚠️ Important: Handling .txt files
Our project is set to ignore .txt files in Git.

Why? So we don't accidentally overwrite each other's test data (like usernames).

Your Job: You must manually create a users.txt file in your project folder once you've cloned it. The system will read it locally, but GitHub will never see it.
