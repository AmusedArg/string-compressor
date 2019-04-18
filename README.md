Testeado con los siguientes metodos

$.ajax({
    type : "POST",
    url : "https://spring-demo-237918.appspot.com/compress",
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

curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"value":"AAABBAAAAABB"}' https://spring-demo-237918.appspot.com/compress
