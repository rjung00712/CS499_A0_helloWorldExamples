var http = require('http');

function onRequest(request, response) {
    console.log(request.url);

    response.writeHead(200, {"Context-Type": "text/plain"});
    response.write("Hello World! Node.JS");
    response.end();
}

http.createServer(onRequest).listen(8888);
console.log('Server is now running');

