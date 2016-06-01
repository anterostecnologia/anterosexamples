'use-strict'

angular.module('buttons', [])
.directive('buttonCloseAlert', function(){
    return{
        restrict: "AE",
        template: '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
    }
})
.directive('buttonInfo', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-info btn-wide" ng-click="action()">{{name}}</a>'
    }
})
.directive('buttonInfoChecked', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-info btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>'
    }
})
.directive('buttonPrimary', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-primary btn-wide" ng-click="action()">{{name}}</a>'
    }
})
.directive('buttonPrimaryChecked', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-primary btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>'
    }
})
.directive('buttonDanger', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-danger btn-wide" ng-click="action()">{{name}}</a>'
    }
})
.directive('buttonDangerChecked', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-danger btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>'
    }
})
.directive('buttonWarning', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-warning btn-wide" ng-click="action()">{{name}}</a>'
    }
})
.directive('buttonWarningChecked', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-warning btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>'
    }
})
.directive('buttonSuccess', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-success btn-wide" ng-click="action()">{{name}}</a>'
    }
})
.directive('buttonSuccessChecked', function(){
    return{
        restrict: "AE",
        scope: {
            href: '@',
            name: '@',
            action: '&'
        },
        template: '<a href="{{href}}" class="btn btn-success btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>'
    }
});
