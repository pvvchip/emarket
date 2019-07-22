#!/usr/bin/env sh

heroku apps:create emarket-ui
heroku addons:create heroku-postgresql:hobby-dev --app emarket-ui
heroku config:set DB_DRIVER=org.postgresql.Driver HIBERNATE_DIALECT=org.hibernate.dialect.PostgreSQLDialect --app emarket-ui
heroku config:set EUREKA_URI=https://emarket-eureka.herokuapp.com/eureka --app emarket-ui
heroku config:set HOST_NAME=https://emarket-ui.herokuapp.com --app emarket-ui

heroku apps:create emarket-chatbot
heroku config:set BOT_NAME=chatbot --app emarket-chatbot
heroku config:set EUREKA_URI=https://emarket-eureka.herokuapp.com/eureka --app emarket-chatbot
heroku config:set HOST_NAME=https://emarket-chatbot.herokuapp.com --app emarket-chatbot

heroku apps:create emarket-eureka