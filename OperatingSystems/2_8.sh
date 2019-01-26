#!/bin/bash
ps ax -o pid,ni,cmd
sudo renice -n 1 -p 3
ps -o pid,comm,nice -p 3