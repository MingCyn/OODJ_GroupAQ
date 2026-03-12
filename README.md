🚀 OODJ_Assignment_GroupAQ
Team Developer Setup & Git Workflow Guide
To keep our code organized and prevent overwriting each other's work, please follow this guide to set up your Eclipse environment.

🔑 1. Initial Setup: Connecting Eclipse to GitHub
⚠️ Do not create a new repository. You must clone the existing one.
• 	Repo URL: https://github.com/MingCyn/OODJ_GroupAQ.git

• 	Steps in Eclipse:
• 	Go to File > Import -> Git > Projects from Git (with smart import).
• 	Select Clone URI and paste the URL
• 	Authentication:
• 	Username: Your GitHub username
• 	Password: Your Personal Access Token (PAT)
• 	⚠️ Standard passwords do not work in Eclipse
• 	🔒 PAT is extremely important — copy and keep a backup safely!
• 	Finish setup and Eclipse will download the project locally

🖥️ 2. Understanding Perspectives (The "Where am I?" Fix)
Eclipse has two main perspectives:
• 	Java Perspective (Icon: J) → Use this 90% of the time for writing code, creating classes, and running programs.
• 	Git Perspective (Icon: Orange Diamond) → Use only when fixing "Remotes" or checking branch history.
👉 If your New Class button disappears, you’re probably in the wrong perspective!

🌿 3. The Golden Rule: Use Branches
⚠️ Never push directly to the main branch. This prevents conflicts.
• 	Create a new branch:
• 	Right-click project → Team > Switch To > New Branch...
• 	Name it after your task (e.g. login-page or inventory-fix)
• 	Sidebar will show  [your-branch-name]  instead of [main]

💾 4. How to Save and Push Your Work
When you finish a task:
1. 	Open Git Staging:
• 	Window > Show View > Other > Git Staging.
2. 	Stage Changes:
• 	Drag .java files from Unstaged → Staged Changes
3. 	Commit:
• 	Write a short message (e.g., "Added login validation")
4. 	Push:
• 	Click Commit and Push → sends code to your branch (not main)

🔄 5. Making a Pull Request (Merging to Main)
Once your code is tested and ready:
1. 	Go to our GitHub Website
2. 	You’ll see a yellow bar: "Your branch had recent pushes."
3. 	Click Compare & Pull Request
4. 	Add a description → Click Create Pull Request
5. 	Team reviews before merging into main

📂 ⚠️ Important: Handling .txt Files
• 	Our project ignores .txt files in Git.
• 	Reason: Prevent overwriting each other’s test data (e.g., usernames).
• 	Your job:
• 	Manually create a users.txt file in your project folder after cloning.
• 	The system will read it locally, but GitHub will never track it.

✅ Follow this workflow and our project will stay clean, organized, and conflict-free.
🔒 And remember: Always back up your PAT — it’s your key to GitHub access
