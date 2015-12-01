var fs  = require('fs');
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== '') {
      solution(line.trim());
    }
});

function solution(line) {
  var obj = JSON.parse(line);
  var arr = obj.menu.items;
  var count  = 0;

  arr.forEach(function(element) {
    if (element !== null && element.label !== undefined) {
      count = count + element.id;
    }
  });
  console.log(count);
}
