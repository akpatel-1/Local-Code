#!/bin/bash

# Ask for class name
read -p "Enter class name: " classname

# Create Java file with the class name
filename="${classname}.java"

# Write the Java boilerplate into the file
cat <<EOF > "$filename"
import java.util.*;
public class $classname {
    public static void main(String[] args) {
        
    }
}
EOF

# Open the file in Visual Studio Code
if command -v code &> /dev/null; then
    code "$filename"
else
    echo "VS Code (code) command not found. Make sure it's installed and added to PATH."
    echo "File created: $filename"
fi
