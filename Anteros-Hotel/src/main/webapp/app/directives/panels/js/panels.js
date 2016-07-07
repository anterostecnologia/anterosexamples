angular.module('panels', [])
.directive('simplePanel', function(){//panel
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            title: '@',
        },
        templateUrl: appHelper.directiveDir +  '/panels/views/simple-panel.html',
    }
})
.directive('simplePanelRow', function(){//panel + row
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            title: '@'
        },
        templateUrl: appHelper.directiveDir +  '/panels/views/simple-panel-row.html'
    }
})
.directive('panel', function(){
    return{
        restrict: "AE",
        transclude: true,
        template: '<div class="panel panel-piluku" ng-transclude></div>'
    }
});
