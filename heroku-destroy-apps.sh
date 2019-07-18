#!/usr/bin/env sh

heroku apps:destroy emarket-ui --confirm emarket-ui
heroku apps:destroy emarket-chatbot --confirm emarket-chatbot
heroku apps:destroy emarket-eureka --confirm emarket-eureka