# android-tech-poc

POC any new technologies to be applied into the real project

## Features

### Navigation Component

- Navigate to a destination
    - Navigation component support several ways for navigating to destination. To explore each
      solution, change `ActionType` at `NavGraphActivity`, `NavGraphHomeAFragment`,
      or `NavGraphHomeCSubFragment`.
    - <img src="https://user-images.githubusercontent.com/51980713/178474051-1b142b93-097b-43ad-8869-5fc06392b7ca.gif" width="250">
- Deep link
    - Deep linking to specific destination has two different types of deep link. Check
      on `ActionType.DEEP_LINK`, `ActionType.MAIN_NAVIGATOR_DEEP_LINK` at `NavGraphHomeAFragment`
      for each type.
    - Available deep links
        - Home A: `androidtechpoc://navgraph/homeA`
        - Home B: `androidtechpoc://navgraph/homeB`
        - Home C: `androidtechpoc://navgraph/homeC`
        - Home C-sub: `androidtechpoc://navgraph/homeCsub`
        - Home D: `androidtechpoc://navgraph/homeD/{displayText}`
    - <img src="https://user-images.githubusercontent.com/51980713/178474070-d422101e-4457-4db8-8899-532f6ec8fc7f.gif" width="250">
