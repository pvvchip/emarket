#!/usr/bin/env sh

heroku container:release web --app=emarket-eureka
heroku container:release web --app=emarket-chatbot
heroku container:release web --app=emarket-ui