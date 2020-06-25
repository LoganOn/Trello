USE trello_db;

INSERT INTO `Board`
  (`Title`, `Position`)
VALUES
  ("BackLog", 1), ("TO DO", 2), ("In Progress", 3), ("Done", 4), ("Archive", 5);

INSERT INTO `Task`
  (`Title`, `BoardID`, `Description`)
VALUES
  ("Task1", 1,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque nec odio eu mi volutpat egestas nec condimentum leo. Vivamus sit amet erat sed nunc lobortis accumsan. Nam convallis nunc nec nisl porttitor, ut volutpat enim pharetra. Nunc mi orci, rhoncus nec lorem vitae, volutpat feugiat augue. Nam id mi suscipit, auctor lorem quis, eleifend orci. Vestibulum vulputate rhoncus erat nec sollicitudin. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam et ipsum felis. Phasellus sit amet bibendum neque, vitae tincidunt tellus. Cras scelerisque euismod diam et tempus. Aliquam sit amet urna rutrum."),
  ("Task2", 1,"Quisque commodo volutpat commodo. Integer commodo ultricies justo in scelerisque. Proin commodo orci condimentum purus tempus, eu scelerisque turpis venenatis. "),
  ("Task3", 1,"Cras pellentesque arcu eget purus imperdiet gravida"),
  ("Task4", 1,"Suspendisse potenti."),
  ("Task5", 1,"Nullam auctor odio ut malesuada gravida..."),
  ("Task6", 1,"Suspendisse potenti."),
  ("Task12", 2,"Cras tincidunt sem sed varius bibendum."),
  ("Task13", 2,"Suspendisse potenti."),
  ("Task14", 3,"Cras tincidunt sem sed varius bibendum."),
  ("Task15", 4,"Sed ut nibh ligula. In sit amet est sit amet lacus pellentesque suscipit."),
  ("Task16", 4,"Nulla mollis dolor ex, quis eleifend metus egestas in."),
  ("Task17", 3,"Vivamus non hendrerit urna"),
  ("Task7", 5,""),
  ("Task8", 5,""),
  ("Task9", 5,""),
  ("Task10", 5,""),
  ("Task11", 5,"");