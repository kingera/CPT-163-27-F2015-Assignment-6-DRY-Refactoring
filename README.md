#### Week 6 (DRY Refactoring) Assignment
This week we are going to further explore DRY and how to refactor code into clean well named methods. The outcomes should be an easy to read driver("HowDRYIAm.java") that removes unnecessary repetitive code. You should look for patterns that allow you to declare variables as close to where they are being used and dividing code into logical units of responsibility where possible. Responsibility should be limited to a single task. Like constructing an object or even smaller, like preparing part of an object.

I have provided you with a less than optimal driver that utilizes an `Address` and `Dimension` class to prepare a `Mailing Label` object which can print Shipping Labels. Using the [Dry Example](https://github.com/WCCCEDU/CPT-163-DRY-RetailItem-Example) simplify this driver and make it DRY.

##### Setup for Github
- Fork the repo to your personal account
- Clone your fork to your local computer
  - From Github Desktop
    - click the + on the top left
    - select clone then search for `CPT-163-27-F2015-Assignment-6-DRY-Refactoring` use the one under the section with your github name
  - From Command Line
    - Copy the `https` link from your fork on github.com (its below the settings button on the right hand side of the page)
    - run `git clone <copied url>` (this will create a folder the same name as the repo in the directory you ran this command)
- Create a branch on your fork of the Assignment-6 Repo using the format <github-name>/<feature_description>
  - From Github Desktop
    - Click the `Add a Branch` button (It should be the button next to the dropdown that says `master`)
    - Make sure you create your branch from master
  - From Command Line
    - run `git checkout -b <branch_name>`
- In Netbeans create a new project and set the __Project Directory__ to the folder that was created when you cloned your fork.
- Write Code!
- Create a commit
  - From Github Desktop
    - Select your fork and fill-in the commit summary
    - Click `Sync`
  - From Command Line
    - run `git add .`
    - run `git commit -m "<your commit message>"`
    - run `git push origin <your_branch_name>`
- Go to Github.com and open your PR by clicking on `Compare and Open Pull Request`
