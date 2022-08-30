export function deepClone(obj) {
  //判断拷贝的obj是对象还是数组
  var objClone = Array.isArray(obj) ? [] : {};
  if (obj && typeof obj === "object") {
    //obj不能为空，并且是对象或者是数组 因为null也是object
    for (const key in obj) {
      if (obj.hasOwnProperty(key)) {
        if (obj[key] && typeof obj[key] === "object") {
          //obj里面属性值不为空并且还是对象，进行深度拷贝
          objClone[key] = deepClone(obj[key]); //递归进行深度的拷贝
        } else {
          objClone[key] = obj[key]; //直接拷贝
        }
      }
    }
  }
  return objClone;
}

/**
 * 
 * @param rows 查询的数据
 * @param charstring 查询数据的字段数组
 * @param name 查询的字段名
 * @param val 输入查询的数据
 * @returns 
 */
export function filterData(rows: any, charstring: string[], name: string, val: string) {
  let temp: any = []
  if (val && val !== '') {
    if (charstring.indexOf(name) >= 0) {
      temp = rows.filter((value) => value[name].toString().indexOf(val) >= 0);
    }
  } else {
    temp = rows;
  }
  return temp;
} 

export function renderTime(date) {
  var dateee = new Date(date).toJSON();
  return new Date(+new Date(dateee) + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '')
}

export function editcell(item:any){
  
} 