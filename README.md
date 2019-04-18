Testeado con los siguientes metodos

$.ajax({
    type : "POST",
    url : "http://localhost:8080/compress",
    contentType : "application/json",
    dataType : "json",      
    data : JSON.stringify({"value" : "AAABBAAAAABB"}),
    error : function(data) {
        console.log(data);
    },
    success : function(data) {  
        console.log(data);
    }
});

curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"value":"AAABBAAAAABB"}' http://localhost:8080/compress
