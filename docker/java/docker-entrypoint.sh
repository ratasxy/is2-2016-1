#!/bin/bash

echo "Installing packages"

gradle clean build
gradle bootRun
