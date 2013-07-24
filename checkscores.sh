#!/bin/bash
echo "(time (-main \"project.clj\"))" | lein repl > out.txt
