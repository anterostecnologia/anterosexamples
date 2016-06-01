angular.module('dark-alerts', [])
.directive('darkAlertInfo', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert bg-info text-white" ng-transclude></div>'
    }
})
.directive('darkAlertDanger', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert bg-danger text-white" ng-transclude></div>'
    }
})
.directive('darkAlertWarning', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert bg-warning text-white" ng-transclude></div>'
    }
})
.directive('darkAlertSuccess', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="alert bg-success text-white" ng-transclude></div>'
    }
});
