Instructions
--

- Clone this repo. This will give you the `lein` script in the current directory. Note: You must have java installed for this to work

- Initialize your first project by running: 

      ```
      lein new speclj ex1
      ```
  
  This will create a new clojure project using the speclj template in the ex1 directory.

- cd to the ex1 directory and run the command:
      
      ```
      lein spec -f d
      ```

      This will recurse through the directory and look for any tests to run. The template creates
      the first test which will fail. You are now ready to use TDD to learn clojure!
