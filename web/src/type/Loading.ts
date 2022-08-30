
//学生接口
export interface UserLoading {
    userName: string,
    passWord: string,
    email?: string,
}
export class IUserLoading {
    loading: UserLoading = {
        userName: '',
        passWord: '',
        email: '',
    }
}

