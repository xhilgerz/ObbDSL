local LavaTile = Instance.new("Part")
LavaTile.Name = "LavaTile"
LavaTile.Size = Vector3.new(4, 1, 4)
LavaTile.Name = "LavaTile"
LavaTile.Color = Color3.new(1, 0.2, 0)
LavaTile.Parent = workspace
local LavaTileScript = Instance.new("Script")
LavaTileScript.Parent = LavaTile
LavaTileScript.Source = [[
local part = script.Parent
part.Touched:Connect(function(hit)
    local humanoid = hit.Parent:FindFirstChildOfClass("Humanoid")
    if humanoid then
        humanoid.Health = 0
    end
end)
]]

