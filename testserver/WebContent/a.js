httpRequest = new XMLHttpRequest();
httpRequest.onreadystatechange = function () {
    console.log("sex");
};
httpRequest.open("GET", "http://localhost:8080/testserver/test", true);
httpRequest.send(null);
