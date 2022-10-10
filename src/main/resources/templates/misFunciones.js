function consultarProductos(){
$.ajax({
url:"https://gac82e968638e51-fcnano8liv5z24at.adb.ca-montreal-1.oraclecloudapps.com/ords/admin/prueba/productos",
type: "GET",
datatype: "JSON",
success: function(respuesta){
console.log(respuesta);
}
}
);
}