Instructions
--

- This branch has a simple failing test to verify your installation works.

- cd to the `./app` directory and run the command:


      ../lein spec -f d


- you should see a failing test that you can fix to pass.


- Windows Users:
  - Assuming you have `java` in your path, you can have to run the additional command to get the leiningen jar in your path as well.
  `..\lein self-install`
  
  This will download and install the leiningen standalone jar in your `HOME\.lein` folder.
  
- You can then run the lein commands from the `app` directory using the windows conventions: `..\lein spec -f d -C`. Use the additional `-C` parameter to suppress color output since powershell by default is unable to process it.
