
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import LostreportLostReportManager from "./components/listers/LostreportLostReportCards"
import LostreportLostReportDetail from "./components/listers/LostreportLostReportDetail"

import 분실폰조회View from "./components/분실폰조회View"
import 분실폰조회ViewDetail from "./components/분실폰조회ViewDetail"
import KtTeleServiceManager from "./components/listers/KtTeleServiceCards"
import KtTeleServiceDetail from "./components/listers/KtTeleServiceDetail"

import MemberMemberManager from "./components/listers/MemberMemberCards"
import MemberMemberDetail from "./components/listers/MemberMemberDetail"

import 보험청구보험청구Manager from "./components/listers/보험청구보험청구Cards"
import 보험청구보험청구Detail from "./components/listers/보험청구보험청구Detail"


import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/lostreports/lostReports',
                name: 'LostreportLostReportManager',
                component: LostreportLostReportManager
            },
            {
                path: '/lostreports/lostReports/:id',
                name: 'LostreportLostReportDetail',
                component: LostreportLostReportDetail
            },

            {
                path: '/lostreports/분실폰조회',
                name: '분실폰조회View',
                component: 분실폰조회View
            },
            {
                path: '/lostreports/분실폰조회/:id',
                name: '분실폰조회ViewDetail',
                component: 분실폰조회ViewDetail
            },
            {
                path: '/kts/teleServices',
                name: 'KtTeleServiceManager',
                component: KtTeleServiceManager
            },
            {
                path: '/kts/teleServices/:id',
                name: 'KtTeleServiceDetail',
                component: KtTeleServiceDetail
            },

            {
                path: '/members/members',
                name: 'MemberMemberManager',
                component: MemberMemberManager
            },
            {
                path: '/members/members/:id',
                name: 'MemberMemberDetail',
                component: MemberMemberDetail
            },

            {
                path: '/보험청구/보험청구',
                name: '보험청구보험청구Manager',
                component: 보험청구보험청구Manager
            },
            {
                path: '/보험청구/보험청구/:id',
                name: '보험청구보험청구Detail',
                component: 보험청구보험청구Detail
            },


            {
                path: '/reportstatuses/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/reportstatuses/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },


    ]
})
