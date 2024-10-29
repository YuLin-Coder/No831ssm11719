const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm11719/",
            name: "ssm11719",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm11719/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "医院住院综合服务管理系统"
        } 
    }
}
export default base
