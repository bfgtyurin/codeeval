var fs  = require('fs');
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== '') {
      solution(line.trim());
    }
});

function solution(line) {
  var arr = line.split(' ');
  var result = 0;
  for (var i = 1; i < 10; i++) {
    result = check(i, arr);
    if (result > 0) {
      break;
    }
  }
  console.log(result);
}

function check(number, array) {
  var count = 0;
  var temp = 0;
  for (var j = 0; j < array.length; j++) {
    if (+array[j] === number) {
      count++;
      temp = j + 1;
    }
  }
  return count > 1 ? 0 : temp;
}