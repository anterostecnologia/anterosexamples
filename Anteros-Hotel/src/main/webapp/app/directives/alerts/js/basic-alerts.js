angular.module('basicAlerts', [])
.directive('basicAlertInfo', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert alert-info" ng-transclude></div>'
    }
})
.directive('basicAlertDanger', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert alert-danger" ng-transclude></div>'
    }
})
.directive('basicAlertWarning', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert alert-warning" ng-transclude></div>'
    }
})
.directive('basicAlertSuccess', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert alert-success" ng-transclude></div>'
    }
});
