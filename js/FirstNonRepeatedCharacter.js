var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split("\n").forEach(function(line) {
  if (line != "") {
    var array = line.split("");
    
    for (var i = 0; i < array.length; i++) {
      var counter = 0;
      var pos = line.indexOf(array[i]);
      while (pos != -1) {
	  counter++;
	  pos = line.indexOf(array[i], pos + 1);
      }
      if (counter === 1) {
	  console.log(array[i]);
	  break;
      }
    }
  }
});
