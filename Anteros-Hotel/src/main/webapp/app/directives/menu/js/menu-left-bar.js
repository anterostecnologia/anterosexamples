angular.module('menu-left-bar', [])
.directive('menuLeftBar', function(){
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            title: '@',
            directoryLogo: '@',
            id: '@'
        },
        templateUrl: appHelper.directiveDir + '/menu/views/menu-left-bar.html'
    }
})
.directive('subMenuLeftBar', function(){
    return{
        restrict: "AE",
        replace: true,
        transclude: true,
        scope: {
            title: '@',
            id: '@'
        },
        templateUrl: appHelper.directiveDir + '/menu/views/sub-menu-left-bar.html'
    }
})
.directive('subMenuIconLeftBar', function(){
    return {
        restrict: "AE",
        replace: true,
        transclude: true,
        scope: {
            classIcon: '@',
            id: '@',
            title: '@'
        },
        templateUrl: appHelper.directiveDir + '/menu/views/sub-menu-icon-left-bar.html'
    }
})
.directive('itemMenuLeftBar', function(){
    return {
        restrict: "AE",
        replace: true,
        transclude: true,
        scope: {
            hrefRoute: '@',
            href: '@',
            title: '@',
        },
        templateUrl: appHelper.directiveDir + '/menu/views/item-menu-left-bar.html'
    }
})
.directive('itemMenuIconLeftBar', function(){
    return{
        restrict: "AE",
        replace: true,
        transclude: true,
        scope: {
            title: '@',
            hrefRoute: '@',
            classIcon: '@',
            href: '@'
        },
        templateUrl: appHelper.directiveDir + '/menu/views/item-menu-icon-felt-bar.html'
    }
});
