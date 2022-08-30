export function isClass(rule:any, value:string, callback:any) {
    if (!value) {
        return callback(new Error('输入不可以为空'));
    }
    var pattern = /^[\u4e00-\u9fa5a-zA-Z-z0-9]+$/im
    if (pattern.test(value)) {
        return callback()
    }
    return callback(new Error('只能输入数字,汉字,字母'))
}
export function isTimeClass(rule:any, value:any, callback:any) {
    let times =/^(\d{4})(-)(\d{2})$/
    if (times.test(value)) {
        return callback();
      }
      return callback(new Error('请输入正确的时间格式:XXXX(年)-XX(月)'))
  }
export function Identity(rule:any, value:string, callback:any){
    let  identity  =  /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/
    if (identity.test(value)) {
        return callback();
      }
      return callback(new Error('请输入正确的身份证号'))
}
export function NumberVerification(rule:any, value:string, callback:any){
    let  number  =  /^\d+$|^\d+[.]?\d+$/
    if (number.test(value)) {
        return callback();
      }
      return callback(new Error('只能输入数字'))
}
export function CharacterVerification(rule:any, value:string, callback:any){
    let  Character = /[^\u4E00-\u9FA5]/g
    if (!Character.test(value)) {
        return callback();
      }
      return callback(new Error('只能输入汉字'))
}
export function IponeVerification(rule:any, value:string, callback:any){
    let  Ipone = /^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/
    if (Ipone.test(value)) {
        return callback();
      }
      return callback(new Error('请输入正确的手机号'))
}