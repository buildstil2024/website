FROM nginx:stable-alpine3.17-slim
COPY index.html /site/.kobweb/site

EXPOSE 9157
CMD ["nginx", "-g", "daemon off;"]