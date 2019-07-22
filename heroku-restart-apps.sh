#!/usr/bin/env sh

heroku dyno:restart --app emarket-chatbot
heroku dyno:restart --app emarket-ui
heroku dyno:restart --app emarket-eureka