# Welcome to the Stratospheric example TODO-app

This is the example app from the book Stratospheric.

## Naming of Environments

There are two environments:

 * staging
 * prod

## Useful Commands

These commands build (and destroy) the services of the whole environment of the TODO-app. They are listed in the 
recommended order, so that the deploy-commands should be executed in the order mentioned here to build the whole 
environment.

 * `npm install`     Installs NPM dependencies. NPM is used as a script engine to ease the actual deployment scripts. 
 * `npm run repository:deploy`          Deploys the repository-app. See package.json for all the apps. 
 * `npm run repository:destroy`          Destroys the repository-app. See package.json for all the apps. 
 * `npm run network:deploy`          Deploys the network-app. See package.json for all the apps.
 * `npm run network:destroy`          Destroys the network-app. See package.json for all the apps. 
 * `npm run service:deploy`          Deploys the service-app. See package.json for all the apps.
 * `npm run service:destroy`          Destroys the service-app. See package.json for all the apps. 

## After Deployment

The public address of the app can be found in the EC2 load balancer, "DNS name".  