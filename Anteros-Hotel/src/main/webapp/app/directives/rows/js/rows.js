angular.module('rows', [])
.directive('row', function(){
    return{
        restrict: "AE",
        transclude: true,
        templateUrl: appHelper.directiveDir +  '/rows/views/row.html'
    }
});
