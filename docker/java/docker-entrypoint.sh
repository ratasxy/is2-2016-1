#!/bin/bash

echo "Installing packages"

gradle build
gradle bootRun
