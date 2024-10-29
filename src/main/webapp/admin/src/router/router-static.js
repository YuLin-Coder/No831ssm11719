import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import hugongxinxi from '@/views/modules/hugongxinxi/list'
    import hugongyuyue from '@/views/modules/hugongyuyue/list'
    import chuyuanguanli from '@/views/modules/chuyuanguanli/list'
    import feiyongxinxi from '@/views/modules/feiyongxinxi/list'
    import users from '@/views/modules/users/list'
    import discusshugongxinxi from '@/views/modules/discusshugongxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yishengxinxi from '@/views/modules/yishengxinxi/list'
    import hugong from '@/views/modules/hugong/list'
    import feiyongleixing from '@/views/modules/feiyongleixing/list'
    import keshifenlei from '@/views/modules/keshifenlei/list'
    import zhuyuanxinxi from '@/views/modules/zhuyuanxinxi/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/hugongxinxi',
        name: '护工信息',
        component: hugongxinxi
      }
          ,{
	path: '/hugongyuyue',
        name: '护工预约',
        component: hugongyuyue
      }
          ,{
	path: '/chuyuanguanli',
        name: '出院管理',
        component: chuyuanguanli
      }
          ,{
	path: '/feiyongxinxi',
        name: '费用信息',
        component: feiyongxinxi
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/discusshugongxinxi',
        name: '护工信息评论',
        component: discusshugongxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/yishengxinxi',
        name: '医生信息',
        component: yishengxinxi
      }
          ,{
	path: '/hugong',
        name: '护工',
        component: hugong
      }
          ,{
	path: '/feiyongleixing',
        name: '费用类型',
        component: feiyongleixing
      }
          ,{
	path: '/keshifenlei',
        name: '科室分类',
        component: keshifenlei
      }
          ,{
	path: '/zhuyuanxinxi',
        name: '住院信息',
        component: zhuyuanxinxi
      }
          ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
