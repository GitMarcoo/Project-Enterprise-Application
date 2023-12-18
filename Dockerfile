FROM node:alpine
RUN mkdir -p /opt/app/dist
WORKDIR /opt/app
COPY ./dist ./dist
ENTRYPOINT npx http-server -p ${PORT} ./dist
