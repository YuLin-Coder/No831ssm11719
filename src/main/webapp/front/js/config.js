
var projectName = '医院住院综合服务管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '医生信息',
	url: './pages/yishengxinxi/list.html'
}, 
{
	name: '护工信息',
	url: './pages/hugongxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssm11719/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"护工","menuJump":"列表","tableName":"hugong"}],"menu":"护工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室分类","menuJump":"列表","tableName":"keshifenlei"}],"menu":"科室分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"住院信息","menuJump":"列表","tableName":"zhuyuanxinxi"}],"menu":"住院信息管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"费用信息","menuJump":"列表","tableName":"feiyongxinxi"}],"menu":"费用信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"费用类型","menuJump":"列表","tableName":"feiyongleixing"}],"menu":"费用类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生信息","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息管理"},{"child":[{"buttons":["查看","修改","删除","查看评论","新增"],"menu":"护工信息","menuJump":"列表","tableName":"hugongxinxi"}],"menu":"护工信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"护工信息列表","menuJump":"列表","tableName":"hugongxinxi"}],"menu":"护工信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","交费","住院","出院"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["审核","查看","出院"],"menu":"住院信息","menuJump":"列表","tableName":"zhuyuanxinxi"}],"menu":"住院信息管理"},{"child":[{"buttons":["查看","支付"],"menu":"费用信息","menuJump":"列表","tableName":"feiyongxinxi"}],"menu":"费用信息管理"},{"child":[{"buttons":["查看","支付"],"menu":"护工预约","menuJump":"列表","tableName":"hugongyuyue"}],"menu":"护工预约管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"护工信息列表","menuJump":"列表","tableName":"hugongxinxi"}],"menu":"护工信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","办理住院"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"buttons":["查看","修改","删除","医嘱","新增"],"menu":"住院信息","menuJump":"列表","tableName":"zhuyuanxinxi"}],"menu":"住院信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"出院管理","menuJump":"列表","tableName":"chuyuanguanli"}],"menu":"出院管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"护工信息列表","menuJump":"列表","tableName":"hugongxinxi"}],"menu":"护工信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"医生","tableName":"yisheng"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"护工预约","menuJump":"列表","tableName":"hugongyuyue"}],"menu":"护工预约管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"护工信息列表","menuJump":"列表","tableName":"hugongxinxi"}],"menu":"护工信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"护工","tableName":"hugong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
