#!/bin/bash

# Stage all changes
git add .

# Ask for commit message
read -p "Enter commit message: " commit_msg

# Commit changes
git commit -m "$commit_msg"

# Push to origin main
git push origin main
