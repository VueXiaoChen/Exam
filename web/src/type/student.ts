
//登陆接口
export interface AllStudent {
    id: number,
    passWord: string,
    email?: string,
}
export class IAllStudent {
    loading: AllStudent = {
        id: 0,
        passWord: '',
        email: '',
    }
}

