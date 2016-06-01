angular.module('panels', [])
  .directive('simplePanel', function(){//panel

    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.scope = {
      title: '@'
    }
    ddo.templateUrl = appHelper.directiveDir +  '/panels/views/simple-panel.html';

    return ddo;

  })
  .directive('simplePanelRow', function(){//panel + row

    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.scope = {
      title: '@'
    }
    ddo.templateUrl = appHelper.directiveDir +  '/panels/views/simple-panel-row.html';

    return ddo;

  })
  .directive('panel', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.template = '<div class="panel panel-piluku" ng-transclude></div>';

    return ddo;
  });
