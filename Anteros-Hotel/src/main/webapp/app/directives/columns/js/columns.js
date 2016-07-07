angular.module('columns', [])
.directive('columnsSeparation', function(){
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            columns: '@',
        },
        template: '<div class="col-md-{{columns}}" ng-transclude></div>'
    }
});
