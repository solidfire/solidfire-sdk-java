#!/bin/bash

# only proceed script when started not by pull request (PR)
if [ $TRAVIS_PULL_REQUEST == "true" ]; then
  echo "this is PR, exiting"
  exit 0
fi

# enable error reporting to the console
set -e

#clone `master' branch of the repository using encrypted GH_TOKEN for authentification
git clone https://${GH_TOKEN}@github.com/solidfire/solidfire-sdk-java.git#gh-pages ../solidfire-sdk-java.gh-pages

# copy generated HTML site to `master' branch
cat ../solidfire-sdk-java.gh-pages/front.yml ./README.md > ../solidfire-sdk-java.gh-pages/index.md

# commit and push generated content to `master' branch
# since repository was cloned in write mode with token auth - we can push there
cd ../solidfire-sdk-java.gh-pages
git config user.email "jason.womack@solidfire.com"
git config user.name "Jason Ryan Womack"
git add -A .
git commit -a -m "Travis #$TRAVIS_BUILD_NUMBER"
git push --quiet origin gh-pages > /dev/null 2>&1