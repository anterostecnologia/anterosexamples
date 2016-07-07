angular.module('animations', [])
.directive('animatedFadeInUpBig', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="animated fadeInUpBig" ng-transclude></div>'
    }
});
