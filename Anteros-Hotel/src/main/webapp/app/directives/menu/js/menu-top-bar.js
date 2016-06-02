angular.module('menu-top-bar', [])
.directive('menuTopBar', function(){
    return{
        restrict: "E",
        transclude:true,
        templateUrl: appHelper.directiveDir + '/menu/views/menu-top-bar.html'
    }
})
.directive('menuMobileBar', function(){
    return{
        restrict: "E",
        replace: true,
        transclude:true,
        scope: {
            id: '@',
            classIcon: '@'
        },
        template: '<div class="menu-bar-mobile" id="open-left"><i class="ti-menu"></i></div>'
    }
})
.directive('itensRightMenuTopBar', function(){
    return{
        restrict: "E",
        replace: true,
        transclude:true,
        template: '<ul class="nav navbar-nav navbar-right top-elements" ng-transclude><ul>'
    }
})
