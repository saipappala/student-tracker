FROM nginx:alpine

# Copy custom Nginx server config
COPY nginx.conf /etc/nginx/conf.d/default.conf

# Copy static web asset
COPY src/index.html /usr/share/nginx/html/index.html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
